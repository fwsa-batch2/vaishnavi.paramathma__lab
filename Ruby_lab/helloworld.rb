# local variable
# (only )
# def vaishu
#     str="hii all" # local variable cannot call out side the method
#     # puts str
#  end
#  vaishu
#  #puts str
#  a ="hii vaishu"
# #  puts a

#  instance variable(@) 
#  It can accessible to all methods (probably pubic) of the class
#  class Animal
#     def can
#         @c="It's a cat"
#         puts @c
#     end
#     def dog
#         @b ="It's a dog"
#         puts @c
#     end
    
    
#     @d ="it's a animal"
    
# end
# myobj = Animal.new
#  myobj.can
#  myobj.dog

# # class variable(@@)
# #It is accessible to all objects of a class

class Bird
    @@name = "Vp"
    def parrot
        @b ="It's a parrot"
    end
    def crow
        @c="It's a crow"
        # puts @@name
    end
    @d ="it's a bird"
    puts @@name
end
# puts @@name
myobj = Bird.new
 myobj.crow
 myobj.parrot

# Global variable 

# class Plant
#     $global ="produce oxygen"
#     def neam
#        puts "global variable is #$global" 
        
#     end
# end
# class Tree
#     def ss 
#         puts  "global variable is #$global"
        
#     end
# end
# obj = Plant.new 
# obj.neam
# myobj = Tree.new
# myobj.ss
# puts $global
