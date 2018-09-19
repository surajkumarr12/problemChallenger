
# This information is obtained upon registration of a new Outlook Application
import json
import requests
from dotmap import DotMap
import csv

client_id = "dfe62f0fd9289bcc8c1e36991d9a229d"
client_secret = "e1944779497f439050bba08b13f7181a"

authorization_base_url = 'https://api.codechef.com/oauth/authorize'
token_url = "https://api.codechef.com/oauth/token"
scope = "public"
redirect_uri = "https://SampleInfinityRedirect/1234"     # Should match Site URL

headers = {
    'content-Type': 'application/json',
}

data = {"grant_type":"client_credentials" , "scope":scope, "client_id":client_id,"client_secret":client_secret,"redirect_uri":redirect_uri}

response = requests.post(token_url, headers=headers, data=json.dumps(data))

res=json.loads(response.content)
data=res['result']

data_dict=data['data']
access_token=data_dict['access_token']

headers = {
    'Accept': 'application/json',
    'Authorization': 'Bearer '+access_token,
}

contest_response = requests.get('https://api.codechef.com/contests', headers=headers)
contest_content = json.loads(contest_response.content)
required_data=DotMap(contest_content)
clist=required_data.result.data.content.contestList
flist=[]
for i in clist:
    print(i.toDict())
    flist.append(i.toDict())
    print("")


csv_columns = ['code','name','startDate','endDate']

csv_file = "C:\\Infinity\\Contests.csv"
try:
    with open(csv_file, 'w') as csvfile:
        writer = csv.DictWriter(csvfile, fieldnames=csv_columns)
        writer.writeheader()
        for data in flist:
            writer.writerow(data)
except IOError:
    print("I/O error")