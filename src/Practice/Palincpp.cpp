#include <iostream>
#include <string>
#include <cctype>

using namespace std;

bool ToSkip(char ch)
{
    return isalnum(ch); // Using the isalnum function from cctype library
}

char toLowerCase(char ch)
{
    return tolower(ch); // Using the tolower function from cctype library
}

bool checkPalindrome(string s)
{
    int start = 0;
    int end = s.size() - 1;

    while (start < end)
    {
        if (ToSkip(s[start]) && ToSkip(s[end]))
        {
            if (toLowerCase(s[start]) != toLowerCase(s[end]))
            {
                return false;
            }
            else
            {
                start++;
                end--;
            }
        }
        else if (!ToSkip(s[start]))
        {
            start++;
        }
        else if (!ToSkip(s[end]))
        {
            end--;
        }
        else
        {
            start++;
            end--;
        }
    }

    return true;
}

int main()
{
    string input;
    getline(cin, input); // Read the entire line including spaces

    if (checkPalindrome(input))
    {
        cout << "Yes\n";
    }
    else
    {
        cout << "No\n";
    }

    return 0;
}
