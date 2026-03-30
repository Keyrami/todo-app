package com.example.semana1;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MarvelCharacter {
    private long id;
    private string nombre;
    private string realName;
    private string team;
    private string firstAppearance;
    private string powers;
    private string origin;
    public MarvelCharacter(){

    }
    public MarvelCharacter( long id, string name, string realname){
        this.id = id;
        this.name = name;
        this.realName = realname;
    }
    public string getName(){

    }
}
