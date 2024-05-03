// const express = require('express');
import express from "express"
import axios from 'axios'

export const api = axios.create({
    baseURL: "http://localhost:8080/v1"
  });
  

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
