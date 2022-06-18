# class Animal
#     def initialize(name)
#         @name = name
#         puts @name
#     end
# end
# class Dog < Animal
#     def initialize(color)
#         super
#         puts color
#     end
# end
# cyrus = Dog.new("sandal")

# class Bird < Animal
#     def initialize(name, lastname)
#         super(name)
#         @lastname =lastname
#     end
# end
# kiki = Bird.new("cyrus","vaishnavi")

class Animals
    def initialize
    end
end
class Bear <Animals
    def initialize(color)
        super()
        @color=color
        puts @color
    end 
end
bear =Bear.new("Red")



 
