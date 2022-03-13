package com.rybakov.springbootbackend.DTO;



public class TestNameDto {
   private String name;

   public TestNameDto(String name) {
      this.name = name;
   }

   public TestNameDto() {
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
