```python
import re

def fix_astra_error(text):
    text = re.sub(r",,", ",", text)
    text = re.sub(r"\.\.", ".", text)
    return text

```
