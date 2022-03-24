# (author, index): (Jakub Łukaszewski, 266485)

import re


def phrase_removal(s: str, r: str):
    count = re.findall(f"({r})", s)
    print(f'# of \'{r}\' occurences: {len(count)}')
    exists = re.search(f'{r}', s)
    if exists is not None:
        result = s.replace(r, "")
    else:
        result = s
    print(f'Final phrase: {result}\n')


phrase_removal("elizabeth2022@hotusun_tomail.com", "Usun_to")
phrase_removal("zyxcba", "x")
phrase_removal("mike.pondsmith2022@housun_totmail.com", "usun_to")
phrase_removal("kayakayakayak", "kayak")
