import OrderCloud as oc 

oc.auth.login("cobrien","fails345","AF40865D-6C91-4C93-BB57-6A4FCB3A2692","FullAccess")
Me = oc.MeApi()

print(Me.get())

Buyers = oc.BuyerApi()
buyerList = Buyers.list()

#Get the first buyerID
buyerid = buyerList['Items'][0]['ID']

Users = oc.UserApi()
print(Users.list(buyerid)['Items'])
print(buyerList)

#Let's create a buyer user 
newuser = oc.models.User(id="Omar",username="omarshehata",password="fails345",active=True,first_name="Omar",last_name="Shehata",email="oshehata@four51.com")
#print(Users.create(buyerid,user=newuser))