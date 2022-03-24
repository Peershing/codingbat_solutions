# (author, index): (Jakub Łukaszewski, 266485)

import re
import os


def pdf(path):
    directory = os.path.basename(f"{path}")
    if os.path.exists(directory):
        files = []
        pattern = r"^(.*work.*)\.(pdf)$"
        for dirpath, dirname, filenames in os.walk(directory):
            for file in filenames:
                if re.match(pattern, str(file)):
                    files.append(f"{dirpath}\\{file}")
        print('\n'.join(files))
    else:
        print('The path doesn\'t exist')
        exit(0)


if __name__ == "__main__":
    pdf('C:/Users/reach/PycharmProjects/list_9/arcane')
