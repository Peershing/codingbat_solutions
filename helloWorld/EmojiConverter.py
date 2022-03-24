def emoji_converter(words):
    emoji_mapping = {
        ':)': '😊',
        ':(': '😟'
    }
    output = ''
    for word in words:
        output += emoji_mapping.get(word, word) + ' '
    return output


sentence = input('> ')
words = sentence.split(' ')
print(emoji_converter(words))
