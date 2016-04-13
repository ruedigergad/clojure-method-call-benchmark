#!/bin/sh

gnuplot -e "prefix='"$1"'" plot_1.gpl
gnuplot -e "prefix='"$1"'" plot_2.gpl

convert -flatten -density 150 -quality 100 -sharpen 0x1.0 ${1}_1.pdf ${1}_1.png
convert -flatten -density 150 -quality 100 -sharpen 0x1.0 ${1}_2.pdf ${1}_2.png

