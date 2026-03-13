require("dotenv").config()

const express = require("express")
const mongoose = require("mongoose")

const contentPlugin = require("./plugins/contentPlugin")

const app = express()

app.use(express.json())

// load plugin
contentPlugin(app)

mongoose.connect(process.env.MONGO_URI)
.then(()=>console.log("MongoDB connected"))

const PORT = process.env.PORT || 3000

app.listen(PORT,()=>{
    console.log("Server running on port "+PORT)
})