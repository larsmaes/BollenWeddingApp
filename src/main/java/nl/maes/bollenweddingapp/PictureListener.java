/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.maes.bollenweddingapp;

import java.io.File;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;

/**
 *
 * @author lars
 */
public class PictureListener implements FileAlterationListener {

    @Override
    public void onStart(FileAlterationObserver observer) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onDirectoryCreate(File directory) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onDirectoryChange(File directory) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onDirectoryDelete(File directory) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onFileCreate(File file) {
        System.out.println("File created");
    }

    @Override
    public void onFileChange(File file) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onFileDelete(File file) {
        System.out.println("File deleted");
    }

    @Override
    public void onStop(FileAlterationObserver observer) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

}
