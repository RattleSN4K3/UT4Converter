/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xtx.ut4converter.t3d;

import org.xtx.ut4converter.MapConverter;

/**
 * All unconverted actors in map
 * will be replaced by this one
 * so mappers can see what was not converted
 * and find some possible replacements.
 * @author XtremeXp
 */
public class T3DNote extends T3DActor {

    String text;
    
    /**
     *
     * @param mc
     */
    public T3DNote(MapConverter mc) {
        super(mc);
    }
    
    /**
     *
     * @param mc
     * @param text
     */
    public T3DNote(MapConverter mc, String text) {
        super(mc);
        this.text = text;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        
        sbf.append(IDT).append("Begin Actor Class=Note Name=").append(name).append("\n");
        sbf.append(IDT).append("\tBegin Object Class=SceneComponent Name=\"SceneComp\"\n");
        sbf.append(IDT).append("\tEnd Object\n");
        

        sbf.append(IDT).append("\tBegin Object Name=\"SceneComp\"\n");
        writeLocRotAndScale();
        sbf.append(IDT).append("\tEnd Object\n");
        sbf.append(IDT).append("\tText=\"").append(text).append("\"\n");
        sbf.append(IDT).append("\tRootComponent=SceneComp\n");
        
        writeEndActor();
        
        return sbf.toString();
    }
    
    
}
