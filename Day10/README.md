- Trapping RainWater
- height = [4, 2, 0, 6, 3, 2, 5];

# We need to Calculate the total trapped water between these bar

- How we will calculate it ?
- For Trapped water on top of a bar, the bar should have left & right boundary which should also greater than bar height

# W will use two helper array which will store the left boundary and right boundary

# Steps to calculate this

- Calculate left max boundary -array
- Calculate right max boundary -array
- loop for iterate the height array & find out the water level and calculate the trapped water
- - waterLevel = min(leftmaxbound, rightmaxbound)
- - trappedwater = waterLevel = height[i]
