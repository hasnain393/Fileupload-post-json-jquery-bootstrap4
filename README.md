# Fileupload-post-json-jquery-bootstrap4
# Uploads file and details using POSTMAN

![POSTMAN](https://user-images.githubusercontent.com/56108097/125193046-25961100-e268-11eb-8789-68d018dc8e32.png)

# Sends details through HTML page 

![html](https://user-images.githubusercontent.com/56108097/125193089-52e2bf00-e268-11eb-9d75-039608fccd29.png)

### Logic : 
* html form has elements in the array
* after submitting form ,store the html form into variable 
* and convert into FormData (FormData store data in key-value pair)
* where key is name of html element and value is the actuall value submitted by User
* FormData = form element (FILE) + jsondata (user data)
* this formdata is then send to REST API 
* Return the Response Entity back
