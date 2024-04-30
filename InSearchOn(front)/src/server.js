const express = require('express');
const app = express();

app.use(express.static('public'));

app.set('view engine', 'ejs');
// app.set('views', __dirname + '/views');

app.get('/', (req, res) => {
    res.render('home.ejs');
});

app.listen(1234, () => {
    console.log('Servidor rodando na porta 1234');
});