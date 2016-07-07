package com.example.michael.todolist2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity
{

    private ListView listView;
    private static final String[] data = { "任务1" };
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.card_listView);
		/*添加头和尾*/
        listView.addHeaderView(new View(this));
        listView.addFooterView(new View(this));
        listView.setAdapter(new ArrayAdapter<String>(this, R.layout.list, R.id.ItemTitle, data));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intnetl = new Intent(MainActivity.this,FileActivity.class);
                startActivity(intnetl);
            }
        });
        listView.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {

            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                menu.add(0, 0, 0, "编辑任务");
                menu.add(0, 1, 0, "查看任务");
                menu.add(0, 2, 0, "删除任务");
                menu.add(0, 3, 0, "完成任务");
            }

        });

    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // 得到当前被选中的item信息
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        switch(item.getItemId()) {
            case 0:
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, EditActivity.class);
                startActivity(intent);
                return true;
            case 1:
                Intent intent2 = new Intent();
                intent2.setClass(MainActivity.this,FileActivity.class);
                startActivity(intent2);
                return true;
            case 2:
                break;
            case 3:
                break;
            default:
                return super.onContextItemSelected(item);
        }
        return true;
    }
}

