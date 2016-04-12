#!/bin/sh

OUTPUT_NAME="$(date "+%Y-%m-%d_%H-%M")_$(hostname)_$(uname)"

echo "Running benchmarks..."
lein test clojure-method-call-benchmark.benchmarks > ${OUTPUT_NAME}_raw_out.txt

grep -e Benchmarking -e "Execution time mean" -e "Execution time std-deviation" ${OUTPUT_NAME}_raw_out.txt > tmp.out

awk '{if (NR%3 == 1 ) {ORS=" "; print $2} else if (NR%3 == 2) {ORS=" "; print ($5 * ($6 == "ns" ? 1 : 1000))} else {ORS="\n"; print ($5 * ($6 == "ns" ? 1 : 1000))}}' tmp.out | sort > tmp.out2

awk 'NR==FNR {if ($1 == "baseline-4-fn-add-closure") baseline = $2 ; next} {print $1,baseline,$2,$3,($2/baseline)}' tmp.out2 tmp.out2 > ${OUTPUT_NAME}_out.txt

rm -f tmp.out tmp.out2

echo "Benchmark results:"
cat ${OUTPUT_NAME}_out.txt

