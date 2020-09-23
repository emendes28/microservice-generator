import os
import argparse


parser = argparse.ArgumentParser(description="Replacer")
parser.add_argument('-i','--replace_input', help='Replace from', required=True)
parser.add_argument('-o','--replace_output', help='Replace to', required=True)
parser.add_argument('-p','--path', help='Path', required=True)
opts = parser.parse_args()


folder_path = opts.path
replace_from = opts.replace_input
replace_to = opts.replace_output

##Alterando arquivos

dirs_path = []
for dname, dirs, files in os.walk(folder_path):
    dirs_path.append('/'.join(dname.split(os.sep)))
    for fname in files:
        fpath = os.path.join(dname, fname)


        with open(fpath) as f:
            s = f.read()
        s = s.replace(replace_from, replace_to)
        s = s.replace(replace_from.lower(), replace_to.lower())
        s = s.replace(replace_from.upper(), replace_from.upper())
        with open(fpath, "w") as f:
            f.write(s)
        if fpath.count(replace_from) > 0:

            fpath_count = fpath.count('/')
            if fpath_count > 0:
                split_fpath = fpath.split('/')
                split_file_path = '/'.join(split_fpath[:fpath_count]), '/'.join(split_fpath[fpath_count:])

                replaced = split_file_path[1].replace(replace_from, replace_to)

                replaced = replaced.replace(replace_from.lower(), replace_to.lower())

                replaced = replaced.replace(replace_from.upper(), replace_to.upper())

                new_fpath = split_file_path[0] + '/' + replaced

                print('{} -> {} (file)'.format(fpath, new_fpath))
            else:
                new_fpath = fpath.replace(replace_from, replace_to)
                new_fpath = new_fpath.replace(replace_from.lower(), replace_to.lower())
                new_fpath = new_fpath.replace(replace_from.upper(), replace_to.upper())
            if not new_fpath == fpath:
                os.system('mv {} {}'.format(fpath, new_fpath))

##Alterando pastas
for directory in dirs_path:
    new_directory = directory.replace(replace_from, replace_to)
    new_directory = new_directory.replace(replace_from.lower(), replace_to.lower())
    new_directory = new_directory.replace(replace_from.upper(), replace_to.upper())
    if not new_directory == directory:
        os.system('mv {} {}'.format(directory, new_directory))
        print('{} -> {} (folder)'.format(directory, new_directory))
