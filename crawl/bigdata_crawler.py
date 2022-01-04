import yfinance as yf

tickers_list = []
with open('ticker.txt', 'r') as f:
    for line in f.readlines():
        tickers_list.append(line.strip())
for i, ticker in enumerate(tickers_list):
    ticker_company = yf.Ticker(ticker)
    df = ticker_company.history(period = "max", interval= "1d")
    if df.shape[0] > 0:
        df.to_json('./data_json/{}.json'.format(ticker))
