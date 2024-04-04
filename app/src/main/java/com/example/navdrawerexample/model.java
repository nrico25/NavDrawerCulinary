package com.example.navdrawerexample;

public class model {
 private String imgUrl;
 private String nameItems;

 private String desItems;

 public model(String imgUrl, String nameItems, String desItems) {
  this.imgUrl = imgUrl;
  this.nameItems = nameItems;
  this.desItems = desItems;
 }

 public String getImgUrl() {
  return imgUrl;
 }

 public String getNameItems() {
  return nameItems;
 }

 public String getDesItems() {
  return desItems;
 }
}
