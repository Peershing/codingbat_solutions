# (author, index): (Jakub Łukaszewski, 266485)

import unittest
import numpy as np
from scipy.linalg import lu_factor


def lu(m):
    _, p = lu_factor(m)
    return p


class LuTest(unittest.TestCase):
    def setUp(self) -> None:
        return super().setUp()

    def test_zero_array(self):
        arr = np.array([[1, 2], [2, 0]])
        self.assertTrue(np.array_equal(lu(arr), np.array([1, 0], [2, 1])))

    def test_non_square_array(self):
        with self.assertRaises(ValueError):
            lu(np.array([[99, 80, 1], [4, 11, 7]]))

    def test_small_matrix(self):
        arr = np.array([[1, 2], [2, 0]])
        self.assertTrue(np.array_equal(lu(arr), np.array([1, 1])))

    def test_big_matrix(self):
        arr = np.array([[2, 5, 8, 7], [5, 2, 2, 8], [7, 5, 6, 6], [5, 4, 4, 8]])
        self.assertTrue(np.array_equal(lu(arr), np.array([2, 2, 3, 3])))


if __name__ == '__main__':
    unittest.main()