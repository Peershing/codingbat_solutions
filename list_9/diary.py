from pathlib import Path
import datetime
import json


class Diary:
    def __init__(self, filename):
        self.file = Path(f"{filename}.json")
        if self.file.exists():
            with open(self.file, "r") as jsf:
                self.entries = json.load(jsf)
        else:
            self.entries = []
            with open(self.file, "w") as jsf:
                json.dump(self.entries, jsf)

    def add_entry(self, entry):
        self.entries.append({"date": datetime.datetime.now().strftime("%c"), "entry": entry})
        with open(self.file, "w") as jsf:
            json.dump(self.entries, jsf)

    def display_entries(self):
        if not self.entries:
            print("\nNo entries in the diary.")
        else:
            sorted_entries = \
                sorted(self.entries, key=lambda x: datetime.datetime.strptime(x['date'], '%c'), reverse=True)
            content = "\n".join([f"{': '.join(dt.values())}" for dt in sorted_entries])
            print('\n' + content)


def diary_retrieve():
    diary = Diary(input("Diary name: "))
    while True:
        choice = input(
            "\n[1] Add an entry \n"
            "[2] Display all entries \n[3] Quit\nYour choice: ")
        if choice == "1":
            diary.add_entry(input("Your text: "))
        elif choice == "2":
            diary.display_entries()
        elif choice == "3":
            exit(0)
        else:
            print("\nWrong choice.\n")


if __name__ == "__main__":
    diary_retrieve()
