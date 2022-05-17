function Customer() {
     var __id;
     var __name;
     var __address;
     var __contact;

     this.setId = function (id) {
         __id = id;
     }

     this.getId = function () {
         return __id;
     }

     this.setName = function (name) {
         __name = name;
     }

     this.getName = function () {
         return __name;
     }

     this.setAddress = function (address) {
          __address = address;
     }

     this.getAddress = function () {
           return __address;
     }

     this.setContact = function (contact) {
         __contact = contact;
     }

     this.getContact = function () {
          return __contact;

     }
}