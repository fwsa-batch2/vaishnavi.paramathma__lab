class Animal
    def sleep
       "It can sleep"
    end
end
class Dog < Animal
    def sleep
        super + " upto 10 hours"
    end
end

cyrus = Dog.new
puts cyrus.sleep