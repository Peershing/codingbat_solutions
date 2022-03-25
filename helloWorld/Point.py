class Point:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z

    def show_coordinates(self):
        print(self.x, self.y, self.z)

    @staticmethod
    def move():
        print('moving ...')
