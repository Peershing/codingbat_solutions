# (author, index): (Jakub Łukaszewski, 266485)


def format_bytes(n: int):
    gb = int(n / 1024**3)
    remainder = n - gb * 1024**3
    mb = int(remainder / 1024**2)
    remainder = remainder - mb * 1024**2
    kb = int(remainder / 1024)
    remainder = remainder - kb * 1024
    b = remainder
    return f'{gb} GB, {mb} MB, {kb} KB, {b} B'


if __name__ == '__main__':
    val = int(input('Bytes: '))
    result = format_bytes(val)
    print(result)
