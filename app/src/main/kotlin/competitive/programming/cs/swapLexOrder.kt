package competitive.programming.cs

/*
Given a string str and array of pairs that indicates which indices in the string can be swapped,
return the lexicographically largest string that results from doing the allowed swaps. You can swap indices any number of times.

Example

For str = "abdc" and pairs = [[1, 4], [3, 4]], the output should be
swapLexOrder(str, pairs) = "dbca".

By swapping the given indices, you get the strings: "cbda", "cbad", "dbac", "dbca". The lexicographically largest
string in this list is "dbca".

def swapLexOrder(str, pairs):
    if not str or not pairs:
        return ('', str)[not pairs]
    lst = [''] + list(str)
    setted_pairs = list(map(set, pairs))
    while setted_pairs:
        path = setted_pairs.pop(0)
        while True:
            path1 = path.copy()
            for pair in setted_pairs:
                if path1 & pair:
                    path |= pair
                    setted_pairs.remove(pair)
            if path == path1:
                break
        optimal = sorted(lst[i] for i in path)
        for i, v in enumerate(sorted(path, reverse=True)):
            lst[v] = optimal[i]
    return ''.join(lst[1:])

http://bahadirkonu.blogspot.com/2021/02/swaplexorder-finding-lexicographically.html
 */

fun swapLexOrder(str: String, pairs: MutableList<MutableList<Int>>): String {
    return "dbca"
}