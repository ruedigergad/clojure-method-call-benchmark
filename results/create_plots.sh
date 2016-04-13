#!/bin/sh

gnuplot -e "prefix='"$1"'" plot_1.gpl
gnuplot -e "prefix='"$1"'" plot_2.gpl

