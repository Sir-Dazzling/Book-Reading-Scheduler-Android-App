package com.example.denvatobookmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;


public class AllBooksActivity extends AppCompatActivity
{
    private static final String TAG = "AllBooksActivity";

    private RecyclerView booksRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        Log.d(TAG, "onCreate: started");

        booksRecView = (RecyclerView) findViewById(R.id.booksRecView);

        BooksRecViewAdapter adapter = new BooksRecViewAdapter(this);
        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("1q84","Haruki Murakimi",1350,"https://images.gr-assets.com/books/14831033311/10357575","A work of Brilliance"));
        books.add(new Book("Iliad","Homer",1000,"https://images.na.ssl-images-amazon.com/images/I/A1sXol13HML.jpg","Greek Heroes and Tragedy"));
        books.add(new Book("Beyond Good and Evil","Nietzseche",350,"https://pressbooks.com/app/uploads/sites/27444/2014/03/beyondgoogandevil1.jpg","The Philosopher's Thought"));

        adapter.setBooks(books);

    }
}
