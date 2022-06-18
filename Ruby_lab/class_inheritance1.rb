class Animal
    def sleep 
        "it can sleep"
    end
end
class Dog < Animal
    def initialize(name)
   @name =name
    end
    def sleep
        "#{@name} 10 hrs" 
    end
end 
class Bird < Animal
end

cyrus = Dog.new("brownie sleep upto")
kiki =Bird.new


puts cyrus.sleep
puts kiki.sleep
