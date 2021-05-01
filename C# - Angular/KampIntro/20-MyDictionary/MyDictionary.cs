using System;
using System.Collections.Generic;
using System.Text;

namespace _20_MyDictionary {
    class MyDictionary<K, I> {
        K[] keys;
        I[] items;

        //public void MyDictionary() { }

        public MyDictionary() {
            keys = new K[0];
            items = new I[0];
        }
        public void Add(K key, I item) {
            I[] tempItems = items;
            items = new I[items.Length + 1];
            for (int i = 0; i < tempItems.Length; i++) {
                items[i] = tempItems[i];
            }
            items[items.Length - 1] = item;

            K[] tempKeys = keys;
            keys = new K[keys.Length + 1];
            for (int i = 0; i < tempKeys.Length; i++) {
                keys[i] = tempKeys[i];
            }
            keys[keys.Length - 1] = key;
        }

        public void List() {
            for (int i = 0; i < items.Length; i++) {
                Console.WriteLine(items[i] + " " + keys[i]);
            }
        }
        public int Count {
            get { return keys.Length; }
        }
    }
}
