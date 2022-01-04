import pandas as pd

df = pd.read_csv('./Top-2000-Valued-Companies-with-Ticker-Symbols.csv')

output = []

for i, row in enumerate(df.iloc[:, 0]):
    row_split = row.split('  ')
    for i in  range(1, len(row_split) - 1):
        if row_split[i] != '':
            value = row_split[i].strip().split('/')[0].split('^')[0]
            if value not in output:
                output.append(value)

with open('input.txt','w') as f:
    for value in output:
        f.write(value+"\n")