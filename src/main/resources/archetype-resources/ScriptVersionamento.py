#!/bin/bash python
import os
​
folder_path = 'teste'
replace_from = 'V2'
replace_to = 'V1'
​
for dname, dirs, files in os.walk(folder_path):
    for fname in files:
        fpath = os.path.join(dname, fname)
        with open(fpath) as f:
            s = f.read()
        s = s.replace(replace_from, replace_to)
        with open(fpath, "w") as f:
            f.write(s)
        if fpath.count(replace_from) > 0:
            new_fpath = fpath.replace(replace_from, replace_to)
            os.system('mv {} {}'.format(fpath, new_fpath))
​
​
print("Alterou")
