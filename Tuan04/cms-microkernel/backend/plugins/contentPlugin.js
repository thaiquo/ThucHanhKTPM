const Post = require("../models/Post")

module.exports = function(app){

// GET ALL
app.get("/posts", async (req,res)=>{
    const posts = await Post.find()
    res.json(posts)
})

// CREATE
app.post("/posts", async (req,res)=>{
    const post = new Post({
        title:req.body.title,
        content:req.body.content
    })

    await post.save()

    res.json(post)
})

// UPDATE
app.put("/posts/:id", async (req,res)=>{
    const post = await Post.findByIdAndUpdate(
        req.params.id,
        req.body,
        {new:true}
    )

    res.json(post)
})

// DELETE
app.delete("/posts/:id", async (req,res)=>{
    await Post.findByIdAndDelete(req.params.id)
    res.json({message:"deleted"})
})

}