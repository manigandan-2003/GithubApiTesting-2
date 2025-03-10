```python
import os

def fix_astra_issue(context_files):
    combined_text = ""
    for file in context_files:
        if os.path.exists(file):
            with open(file, 'r', encoding='utf-8') as f:
                combined_text += f.read() + " "  #add space for separation
        else:
            print(f"Warning: File '{file}' not found.")
    return combined_text.strip()

context_files = ["doc_Summa-2.txt_2", "doc_Summa-2.txt_5", "doc_Summa-2.txt_3"]
fixed_text = fix_astra_issue(context_files)
print(fixed_text)

```
