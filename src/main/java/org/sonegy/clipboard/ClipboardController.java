package org.sonegy.clipboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sonegy@sk.com
 */
@Controller
public class ClipboardController {

    private List<Data> dataList = new ArrayList<>();

    @RequestMapping(value = "/current")
    @ResponseBody
    public Data getCurrentData() {
        Data data = dataList.size() > 0 ? dataList.get(dataList.size() - 1) : null;
        System.out.println("data = " + data);
        return data;
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public void updateData(@RequestParam String text) {
        dataList.add(new Data(text));
    }

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
