class ANIMAL
    def eat
     a= "it can eat"
    end
end

class Dog < ANIMAL
end

class Bird < ANIMAL
end

cyrus = Dog.new
kiki = Bird.new
puts cyrus.a
puts kiki.a
