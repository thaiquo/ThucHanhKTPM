const fs = require("fs")
const path = require("path")

function loadPlugins(app){

const pluginsPath = path.join(__dirname,"../plugins")

const files = fs.readdirSync(pluginsPath)

files.forEach(file=>{

const plugin = require(`../plugins/${file}`)

plugin(app)

})

}

module.exports = loadPlugins