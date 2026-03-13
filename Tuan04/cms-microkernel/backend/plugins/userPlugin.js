module.exports = function(app){

app.post("/login",(req,res)=>{

const {username} = req.body

res.json({
message:"Login success",
user:username
})

})

}