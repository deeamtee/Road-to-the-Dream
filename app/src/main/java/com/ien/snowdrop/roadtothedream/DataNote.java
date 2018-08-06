package com.ien.snowdrop.roadtothedream;


    public class DataNote{
        String text;
        String comment;
        String date;
        int image;

        public DataNote(String text, String comment, String date, int image)
        {
            this.text = text;
            this.comment = comment;
            this.date = date;
            this.image = image;
        }

        public String getText()
        {
            return text;
        }

        public String getComment()
        {
            return comment;
        }

        public String getDate()
        {
            return date;
        }

        public int getImage(){
            return image;
        }
    }