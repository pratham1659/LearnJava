def solve(N, S):
    max_count = 0
    result_char = ''

    for char in sorted(set(S)):
        count = 0
        for i in range(N):
            if S[i] == char:
                count += (i + 1) * (N - i)
        if count > max_count or (count == max_count and char < result_char):
            max_count = count
            result_char = char

    return result_char


# Take user input for N and S
N = int(input())
S = input()

# Call the solve function with user input
result = solve(N, S)

# Display the result
print(result)
