# nums = [2, 4, 200, 400]

# nums.each {|element| element * 2}
# print nums

# puts nums = [2, 4, 200, 400]
# puts new_nums = nums.map {|number| number * 2 }
# print nums 

# print new_nums
# new_nums = [2, 4, 200, 400]
# new_nums.each {|n| puts n + 2 }
# puts new_nums

# nums = [2, 4, 200, 400]
# nums.each {|x| puts "The current number is #{x}" }

# nums = [2, 4, 200, 400]
# new_nums = nums.map {|number| number * 125 }
# new_nums.each {|n| puts n }

# SPLIT
#  arr = "1 ,2 ,3, 4, 5 ,6"
# print arr.split(',')
# puts "1,2,,3,4,,".split(',')

# JOIN
# puts [ "a", "b", "c" ].join        
# puts [ "a", "b", "c" ].join("-") 

# array =[1,2,3,4,5]
# puts array.select{ |num| num <3}
# puts array.reject{|num| num >3}
# puts array.select{ |num| num >1}.reject{|num| num <4}

#L3 

# puts array.include? 2
# puts array.select {|num| num >2}
# puts array.index 3

# library = {}
# library["austen"] = ["Pride and Prejudice", "Sense and Sensibility"]
# library["asimov"] = ["Robots of Dawn", "I, Robot"]

# authors = library.keys
# puts "These are the authors in my catalog: #{authors.join(', ')}"

# library.each do |author, books|
#   puts "#{author.capitalize} wrote the books #{books.join(', ')}"
# end

# marks ={}
# marks["vaish"] =[95,96,97,98,99]
# marks["cyrus"]=[99,98,97,96,95]

# marks.each do|name,marks|
#     puts "#{name.capitalize} subject marks #{marks.join(',')}"
# end

# names=[]
# names.push "vaishu"
# names.push "keerthu"
# names.push "muzarf"
#  puts 
# puts names
#  puts names.pop

# a = "Apples Oranges Crows Telephone Light Sugar"
# puts a
# puts "Wait there are not 10 things in that list. Let's fix that."
# print Aa= a.split(' ')
# b =["Day", "Night", "Song", "Frisbee", "Corn", "Banana", "Girl", "Boy"]
# print b

# while Aa.length != 10
#     Bb= b.pop
#     puts "adding : #{next_one}"
#    Aa.push(next_one)
#    puts "there are #{Aa.length} items now"
#   end

# ten_things = "Apples Oranges Crows Telephone Light Sugar"

# puts "Wait there are not 10 things in that list. Let's fix that."

# stuff = ten_things.split(' ')
# more_stuff = ["Day", "Night", "Song", "Frisbee", "Corn", "Banana", "Girl", "Boy"]
# while stuff.length !=10
#   next_one =more_stuff.pop
#   puts "Adding #{next_one}"
#   stuff.push(next_one)
#   puts "There are #{stuff.length} items are there"
# end

#  def salute(fname,sname)
#     a  = sname.capitalize 
#     b = fname.split.last
#     p "#{a} Mr. #{b}"
#  end

# def yield_meth
#     yield
#     yield 10
# end
# puts yield_meth{|i| puts "the number is #{i}"}   

#RECURSIVE FUNCTION
# abc={
#     :name => "vaishu",
#     :sname =>"paramathma"
# }
# xyz={
#     :name => "cyrus",
#     :child => [abc]
# }

# def recursive_meth(xyz)
#     if xyz[:name]=="vaishu"
#         p "nice name"
#     elsif xyz[:name]="cyrus"
#         puts xyz[:child]
#         # :child.each{|chill| recursive_meth chill}
#     end
# end
# recursive_meth(xyz)

# COMPOSITION
# class Animal
#   def eat
#     puts "eating"
#   end
#   def move
#     puts "moving"
#   end
# end
# class Tiger 
#   def initialize 
#     @animal=Animal.new
#   end
#   def move
#     @animal.eat
#     puts "moving fast"
#   end
# end
# obj=Tiger.new
# obj.move

  
 
