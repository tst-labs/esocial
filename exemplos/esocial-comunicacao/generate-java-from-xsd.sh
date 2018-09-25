#!/bin/sh
DIR=src/main/resources/xsd
DEST=target/generated-sources/xsd/java
BASE_PACKAGE=br.jus.esocialjt.comunicacao

mkdir -p $DEST
rm -rf $DEST/*

for FOLDER in $(ls $DIR)
do
    for FILE in $(ls $DIR/$FOLDER)
    do 
       PACKAGE=$( echo $FOLDER | sed --expression 's/\([A-Z]\)/.\L\1/g' --expression 's/^.//')
        xjc -nv -d $DEST -p "$BASE_PACKAGE.$PACKAGE" $DIR/$FOLDER/$FILE
    done
done