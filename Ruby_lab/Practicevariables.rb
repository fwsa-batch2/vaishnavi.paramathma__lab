$global ="it can sleep"
class Dog
    @@name ="cyrus"


    def character
      puts  str = "it is a dog"
        @barking = "loudly barks"
        puts @barking
        puts @run
        puts @@name
    end

    def life_style
        @run= "it eat pedigree"
        puts @run
        #puts @barking
    end
    puts @@name
end
myobj =Dog.new
myobj.character 
myobj.life_style