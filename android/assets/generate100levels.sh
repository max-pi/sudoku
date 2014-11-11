#!/bin/bash

# loops 100 times and generates a file

./levelGenerator.py > levels100.txt

for i in `seq 1 99`;
	do
                ./levelGenerator.py >> levels100.txt
        done    
        
