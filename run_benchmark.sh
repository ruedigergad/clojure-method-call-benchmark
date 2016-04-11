#!/bin/sh

OUTPUT_NAME="$(date "+%Y-%m-%d_%H-%M")_$(hostname)_$(uname)"

echo "Running benchmarks..."
lein test clojure-method-call-benchmark.benchmarks > ${OUTPUT_NAME}_raw_out.txt

grep -e Benchmarking -e "Execution time mean" ${OUTPUT_NAME}_raw_out.txt | sed '$!N;s/\n/ /' | awk '{print $2,($7 * ($8 == "ns" ? 1 : 1000))}' | sort > tmp.out ; awk 'NR==FNR {if ($1 == "baseline-4-fn-add-closure") baseline = $2 ; next} {print $1,baseline,$2,($2/baseline)}' tmp.out tmp.out > ${OUTPUT_NAME}_out.txt

rm -f tmp.out

echo "Benchmark results:"
cat ${OUTPUT_NAME}_out.txt

