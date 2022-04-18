package utils.mapper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import bank.models.MonobankResponse;
import bank.models.NBUResponseItemDTO;
import bank.models.PrivatBankResponse;

public class GsonMapper {
    Gson gson = new Gson();

    public PrivatBankResponse mapJsonToListPrivatBankResponse(String json) {
        return gson.fromJson(json, PrivatBankResponse.class);
    }

    public List<NBUResponseItemDTO> mapJsonToListNBUResponseItemDTO(String json) {
        Type typeToken = new TypeToken<ArrayList<NBUResponseItemDTO>>() {
        }.getType();

        return gson.fromJson(json, typeToken);
    }

    public List<MonobankResponse> mapJsonToListMonobankResponse(String json) {
        Type userList = new TypeToken<ArrayList<MonobankResponse>>() {
        }.getType();

        return gson.fromJson(json, userList);
    }
}