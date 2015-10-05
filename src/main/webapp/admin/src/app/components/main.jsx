/** In this file, we create a React component which incorporates components provided by material-ui */

const React = require('react');
const RaisedButton = require('material-ui/lib/raised-button');
const Dialog = require('material-ui/lib/dialog');
const ThemeManager = require('material-ui/lib/styles/theme-manager');
const LightRawTheme = require('material-ui/lib/styles/raw-themes/light-raw-theme');
const Colors = require('material-ui/lib/styles/colors');
const TagsTable = require('./tagstable.jsx')
const NewTagDialog = require('./newtagdialog.jsx');

const Main = React.createClass({

    childContextTypes: {
        muiTheme: React.PropTypes.object,
    },

    getInitialState () {
        return {
            muiTheme: ThemeManager.getMuiTheme(LightRawTheme),
        };
    },

    getChildContext() {
        return {
            muiTheme: this.state.muiTheme,
        };
    },

    componentWillMount() {
        let newMuiTheme = ThemeManager.modifyRawThemePalette(this.state.muiTheme, {
            accent1Color: Colors.deepOrange500,
        });

        this.setState({muiTheme: newMuiTheme});
    },

    render() {

        let containerStyle = {
            textAlign: 'center',
        };

        let standardActions = [
            { text: 'Okay' },
        ];

        let tags = [{id: 0, name: 'Test Name One'}, {id: 1, name: 'Test Name Two'}];

        return (
            <div style={containerStyle}>
                <h1>New Post</h1>
                <div className='col-md-4'>
                </div>
                <div className='col-md-4'>
                    <TagsTable tags={tags} />
                    <NewTagDialog />
                </div>
                <div className='col-md-4'>
                </div>
            </div>
        );
    },

    _handleTouchTap() {
        this.refs.superSecretPasswordDialog.show();
    },

});

module.exports = Main;
