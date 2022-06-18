class Animal
    def eat
        puts "it can eat" 
    end
    def runs
        puts"it runs"
    end
end
class Dog <Animal
    def eat
        puts "it eat egg"
    end
    def runs
        puts"it run very fast"
    end
end
class Parrot <Animal
    def eat
        puts "it eat seeds"
    end
    def runs
        puts"it fly very fast"
    end
end
animal =Animal.new
animal.eat
animal.runs
animal =Dog.new
animal.eat
animal.runs
animal = Parrot.new
animal.eat
animal.runs
