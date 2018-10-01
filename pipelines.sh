#!/bin/bash
#
# See http://holgerbrandl.github.io/kotlin/2017/05/08/kscript_as_awk_substitute.html
#

awk -v OFS='\t' '{ print $12, $4 }' data/some_flights.tsv
kscript -t 'lines.split().select(12,4).print()' data/some_flights.tsv

echo

kscript -t 'lines.split().select(with(1..4).and(12)).print()' data/some_flights.tsv

echo

kscript -t 'println( lines.filter { it.matches(Regex(".*N80.JB.*")) }.count() )' data/some_flights.tsv
kscript -t 'println( lines.count { it.matches(Regex(".*N80.JB.*")) } )' data/some_flights.tsv
