package translate;

import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.ArrayList;
import java.util.List;

public class ClassDiagramConfig {

    private List<VoidVisitorAdapter<Void>> visitorAdapters;
    private boolean showMethods;
    private boolean showAttributes;
    private boolean showColoredAccessSpecifiers;

    //private constructor, use builder only
    private ClassDiagramConfig(){};

    public List<VoidVisitorAdapter<Void>> getVisitorAdapters() {
        return visitorAdapters;
    }

    public void setVisitorAdapters(List<VoidVisitorAdapter<Void>> visitorAdapters) {
        this.visitorAdapters = visitorAdapters;
    }

    public boolean isShowMethods() {
        return showMethods;
    }

    public void setShowMethods(boolean showMethods) {
        this.showMethods = showMethods;
    }

    public boolean isShowAttributes() {
        return showAttributes;
    }

    public void setShowAttributes(boolean showAttributes) {
        this.showAttributes = showAttributes;
    }

    public boolean isShowColoredAccessSpecifiers() {
        return showColoredAccessSpecifiers;
    }

    public void setShowColoredAccessSpecifiers(boolean showColoredAccessSpecifiers) {
        this.showColoredAccessSpecifiers = showColoredAccessSpecifiers;
    }

    //builder
    public static class Builder implements UmlConfigBuilder{

        //default values for attributes
        private List<VoidVisitorAdapter<Void>> visitorAdapters=new ArrayList<>();
        private boolean showMethods=true;
        private boolean showAttributes=true;
        private boolean showColoredAccessSpecifiers=false;

        public Builder withVisitor(VoidVisitorAdapter<Void> visitor){
            visitorAdapters.add(visitor);
            return this;
        }

        public Builder setShowMethods(boolean showMethods){
            this.showMethods=showMethods;
            return this;
        }

        public Builder setShowAttributes(boolean showAttributes){
            this.showAttributes=showAttributes;
            return this;
        }

        public Builder setShowColoredAccessSpecifiers(boolean showColoredAccessSpecifiers){
            this.showColoredAccessSpecifiers=showColoredAccessSpecifiers;
            return this;
        }

        @Override
        public ClassDiagramConfig build() {

            ClassDiagramConfig config=new ClassDiagramConfig();
            config.setVisitorAdapters(visitorAdapters);
            config.setShowAttributes(showAttributes);
            config.setShowColoredAccessSpecifiers(showColoredAccessSpecifiers);
            config.setShowMethods(showMethods);
            return config;
        }
    }

    //default director for builder
    public static class DefaultDirector{

        public ClassDiagramConfig construct(){
            return new Builder().build();
        }

    }


}
