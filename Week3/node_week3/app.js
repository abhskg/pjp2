var express = require('express')
var app = express()
var port = process.env.port || 3000; 

app.use(express.static(__dirname+ '/public'));


app.get('/', (req,res)=>{
	res.sendFile('index.htm')
})


app.listen(port,()=>{
	console.log("Server is listening at port 3000....")
})